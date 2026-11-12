import java.util.*;


public static void  splitStack(Stack<Integer> s) {
    Queue<Integer> q = new LinkedList<>();
    while (!s.isEmpty()) {
        q.add(s.pop());
    }

    int size = q.size();
    for(int i =0; i<size;i++){
        int n = q.remove();
        if(n<0){
            s.push(n);
        }else{
            q.add(n);
        }
    }
    while(!q.isEmpty()){
        s.push(q.remove());
    }






}
