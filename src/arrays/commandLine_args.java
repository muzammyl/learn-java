package src.arrays;

// run this using command 'javac commandLine_args.java' then 'java commandLine_args.java this is java 11'
class commandLine_args {
    public static void main(String[] args) {
        for(int i = 0; i < args.length; i++) {
            System.out.println("args[" + i + "]" + " = " + args[i]);
        }
    }
}