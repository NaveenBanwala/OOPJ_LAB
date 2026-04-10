class first {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String name = sc.nextLine();
    int rollNo = sc.nextInt();
    int section = sc.nextInt();

    // Consume the newline character after the section input
    sc.nextLine(); // This line is added to fix the issue

    String branch = sc.nextLine();

    System.out.println(" Name is " + name);
    System.out.println("Roll NO is " + rollNo);
    System.out.println("Section is " + section);
    System.out.println("Branch is " + branch);

    sc.close();
  }
}