class StringDemo {
    public static void main(String[] args) {
        StringBuffer str1 = new StringBuffer("hello");
        str1.insert(5, "java");        // hello -> hellojava
        str1.replace(0, 5, "hi");      // hellojava -> hijava
        str1.reverse();                // hijava -> avajih
        System.out.println("StringBuffer: " + str1);


	 StringBuilder str2 = new StringBuilder("World");
         str2.insert(0, "Java ");   // Step 1
         str2.replace(5, 10, "Program"); // Step 2
         str2.delete(0, 5);         // Step 3
         str2.reverse();            // Step 4
        System.out.println("StringBuilder: " + str2);
    }
}
