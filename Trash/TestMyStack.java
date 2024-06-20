package Trash;

public class TestMyStack {
    public static void main(String[] args) {
        GenericStack<Character> teststack = new GenericStack<>();

        teststack.push('a');
        teststack.push('b');
        teststack.push('c');

        System.out.println(teststack.toString());

        // System.out.println(teststack.search('b'));
        
        if(teststack.search('b')){
            System.out.println("got bro");
        }else{
            System.out.println("got no bro");
        }

        if(teststack.search('k')){
            System.out.println("got bro");
        }else{
            System.out.println("got no bro");
        }
    }
}
