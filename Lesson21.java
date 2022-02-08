package com.company;

public class Lesson21 {
    public static class IntConstantOperator implements StackOperator{

        private Integer value ;

        public IntConstantOperator(int value) {
            this.value = value ;
        }
        public Integer getValue() {
            return value ;
        }
        public void apply(Stack<Integer> st) {
            st.push(value) ;
        }
        public String toString() {
            return value.toString();
        }
    }

    public static class IntMultOperator implements StackOperator{

        public IntMultOperator(){
        }
        //Assumes legal expression
        public void apply(Stack<Integer> st){
            Integer rhs = (Integer) st.pop();
            Integer lhs = (Integer) st.pop();
            st.push(lhs*rhs);
        }
        public String toString(){
            return "*";
        }

    }
    public static class IntDivideOperator implements StackOperator{

        public IntDivideOperator(){
        }
        //Assumes legal expression
        public void apply(Stack<Integer> st){
            Integer rhs = (Integer) st.pop();
            Integer lhs = (Integer) st.pop();
            st.push(lhs/rhs);
        }
        public String toString(){
            return "/";
        }

    }
    public static class IntPlusOperator implements StackOperator{

        public IntPlusOperator(){
        }
        //Assumes legal expression
        public void apply(Stack<Integer> st){
            Integer rhs = st.pop();
            Integer lhs = st.pop();
            st.push(lhs+rhs);
        }
        public String toString(){
            return "+";
        }

    }
    public static class IntMinusOperator implements StackOperator{

        public IntMinusOperator(){
        }
        //Assumes legal expression
        public void apply(Stack<Integer> st){
            Integer rhs = st.pop();
            Integer lhs = st.pop();
            st.push(lhs-rhs);
        }
        public String toString(){
            return "-";
        }

    }
    // Assumes legal expression
    public static int evaluate1(Object[] postfixExpr) {
        Stack<Integer> st = new StackAsDynamicArray<>() ;
        for(Object item: postfixExpr) {
            if(item instanceof Integer)
                st.push((Integer) item);
            else {
                Integer rhs = st.pop();
                Integer lhs = st.pop();
                if(item.equals("+"))
                    st.push(lhs+rhs);
                else if(item.equals("*"))
                    st.push(lhs*rhs);
                else if(item.equals("-"))
                    st.push(lhs-rhs);
                else if(item.equals("/"))
                    st.push(lhs/rhs);
            }
        }
        Integer ans = st.pop();
        return ans;
    }

    // Assumes legal expression
    public static int evaluate2(StackOperator[] postfixExpr ) {
        Stack<Integer> st = new StackAsDynamicArray<>() ;
        for(StackOperator op: postfixExpr) {
            op.apply(st) ;
        }
        Integer ans = st.pop();
        return ans;
    }
}
