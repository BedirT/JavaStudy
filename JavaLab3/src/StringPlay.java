
public class StringPlay {

    public static void main(String[] args) {
        
        String college = new String("PoDunk College");
        String town = "Anytown,USA"; // part (a)
        int stringLength = 0;
        String change1, change2, change3;
        int StringLength = college.length(); // part (b)
        System.out.println(college + " contains " + stringLength + " characters.");
        change1 = college.toUpperCase(); // part (c)
        change2 = college.replace("O", "*"); // part (d)
        change3 = college.concat(town); // part (e)
        System.out.println("The final string is " + change3);
    
    }
}
