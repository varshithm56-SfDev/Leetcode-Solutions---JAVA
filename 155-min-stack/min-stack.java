class MinStack {
 

       Stack<Integer> mystack ;
       Stack<Integer> minstack;
    public MinStack() 
    {
        mystack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) 
    {
       // if(mystack.isEmpty()){
       // mystack.push(val);
        //minstack.push(val);}

       // else if(minstack.peek()>=val)
       // {
       //     minstack.push(val);
       //     mystack.push(val);
       // }
        mystack.push(val);


        if(minstack.isEmpty()|| val<=minstack.peek())
        minstack.push(val);
    }
    
    public void pop() 
    {
           int poppedvalue=mystack.pop();

           if(poppedvalue== minstack.peek()) 
           minstack.pop();
    }
    
    public int top() 
    {
       // if(mystack.isEmpty()) return 0;

       return  mystack.peek();
    }
    
    public int getMin() {
        //if (minstack.isEmpty()) return 0;
        
        return minstack.peek();
    }
}
