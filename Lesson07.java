package com.company;

import java.util.ArrayList;
import java.util.List;

public class Lesson07 {
    public static void explainSAT() {
        int nVars = 3;
        SATSolver.init(nVars); // number of clauses

        int[] clause = {1} ;
        SATSolver.addClause(clause); // add a single clause

        int[][] clauses = {{-1,-2}, {2,3}} ;
        SATSolver.addClauses(clauses); // add multiple clauses

        boolean[] assignment = SATSolver.getSolution(); // get soultion
        // empty = unsat; null = timeout; array = solution;

        if (assignment == null) System.out.println("TIMEOUT");
        else if (assignment.length == nVars+1)
            System.out.println("SAT");
        else
            System.out.println("UNSAT");
    }

    //Mapping to unique numer each i and j
    public static int map(int i, int j) {
        if(i>j){
            return j+1+(i*(i-1)/2);
        }
        return i+1+(j*(j-1)/2);
    }

    //Soultion using SAT to the party problem,
    // assuming the demand for friend or not with n people is the same
    public static boolean party(int people, int friends){
        boolean solve;
        int n = people*(people-1)/2; // how many variables the cnf need
        // all the sets from 0 to people in the size of friends
        List<int[]> satknow = generate(people,friends);
        int siz = 0; // length of each clause
        for(int i=0;i<satknow.get(0).length-1;i++){
            for(int j=i+1;j<satknow.get(0).length;j++){
                siz++;
            }
        }

        int[][] all = new int[satknow.size()*2][siz]; // twice - for friend and not

        int index = 0;
        // for each set of people make a clause for the cnf
        for(int[] me:satknow){
            int index1= 0;
            for(int i=0;i<me.length-1;i++){
                for(int j=i+1; j<me.length;j++){
                    if(i<j){
                        all[index][index1] = map(me[i],me[j]);
                        index1++;}
                }
            }
            index++;
        }
        // copy the first clause but now its negative
        for(int i=0;i< all.length/2;i++){
            int[] ints = all[i].clone();
            for (int j = 0; j < ints.length; j++) {
                ints[j] = -ints[j];
            }
            all[i+ all.length/2] = ints;
        }

        SATSolver.init(n);
        SATSolver.addClauses(all);

        boolean[] assignment = SATSolver.getSolution();

        if (assignment == null) throw new RuntimeException("Timeout error");
        else solve = assignment.length == n + 1;

        return solve;
    }

    private static void helper(List<int[]> combinations, int[] data, int start, int end, int index) {
        if (index == data.length) {
            int[] combination = data.clone();
            combinations.add(combination);
        } else if (start <= end) {
            data[index] = start;
            helper(combinations, data, start + 1, end, index + 1);
            helper(combinations, data, start + 1, end, index);
        }
    }

    public static List<int[]> generate(int n, int r) {
        List<int[]> combinations = new ArrayList<>();
        helper(combinations, new int[r], 0, n-1, 0);
        return combinations;
    }
}
