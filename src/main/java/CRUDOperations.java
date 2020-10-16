import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

class CRUDOperations {
    static Scanner strInput = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        String choice, cont = "y";

        while (cont.equalsIgnoreCase("y")) {
            System.out.println("\t\t Employee Information System\n\n");

            System.out.println("1 ===> Add New Employee Record ");
            System.out.println("2 ===> View All Employee Record ");
            System.out.println("3 ===> Delete Employee Record ");
            System.out.println("4 ===> Search Specific Record ");
            System.out.println("5 ===> Update Specific Record ");

            System.out.print("\n\n");
            System.out.println("Enter your choice: ");
            choice = strInput.nextLine();

            switch (choice) {
                case "1":
                    CRUDOperations.AddRecord();
                    break;
                case "2":
                    CRUDOperations.ViewAllRecord();
                    break;
                case "3":
                    CRUDOperations.DeleteRecordByID();
                    break;
                case "4":
                    CRUDOperations.SearchRecordbyID();
                    break;
                case "5":
                    CRUDOperations.updateRecordbyID();
                    break;
            }


            System.out.println("Do you want to continue? Y/N");
            cont = strInput.nextLine();

        }
    }

        public static void AddRecord()throws IOException {

            BufferedWriter bw = new BufferedWriter(new FileWriter("CrudFile.txt", true));
            Scanner strInput = new Scanner(System.in);

            String ID, name, age, addr;

            System.out.print("Enter the Employee ID: ");
            ID = strInput.nextLine();
            System.out.print("Enter the Employee Name: ");
            name = strInput.nextLine();
            System.out.print("Enter the Employee Age: ");
            age = strInput.nextLine();
            System.out.print("Enter the Employee Address: ");
            addr = strInput.nextLine();

            bw.write(ID + "," + name + "," + age + "," + addr);
            bw.flush();
            bw.newLine();
            bw.close();

        }


        public static void ViewAllRecord() throws IOException {
            BufferedReader br = new BufferedReader(new FileReader("CrudFile.txt"));

            String record;

            System.out.println(" ------------------------------------------------------------- ");
            System.out.println("|	ID		Name 				Age			Address 		  |");
            System.out.println(" ------------------------------------------------------------- ");

            while ((record = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(record, ",");

                System.out.println("|	" + st.nextToken() + "	" + st.nextToken() + " 		" + st.nextToken() + "			" + st.nextToken() + "      |");

            }

            System.out.println("|	                                            	          |");
            System.out.println(" ------------------------------------------------------------- ");
            br.close();

        }


        public static void DeleteRecordByID() throws IOException {
            Scanner strInput = new Scanner(System.in);
            String ID, record;


            File tempDB = new File("CrudFileTemp.txt");
            File db = new File("CrudFile.txt");


            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));


            System.out.println("\t\t Delete Employee Record\n");

            System.out.println("Enter the Employee ID: ");
            ID = strInput.nextLine();


            while ((record = br.readLine()) != null) {


                if (record.contains(ID))
                    continue;

                bw.write(record);
                bw.flush();
                bw.newLine();

            }

            br.close();
            bw.close();

            db.delete();

            tempDB.renameTo(db);

        }

        public static void SearchRecordbyID() throws IOException {
            String ID, record;
            Scanner strInput = new Scanner(System.in);

            BufferedReader br = new BufferedReader(new FileReader("CrudFile.txt"));

            System.out.println("\t\t Search Employee Record\n");


            System.out.println("Enter the Employee ID: ");
            ID = strInput.nextLine();

            System.out.println(" ------------------------------------------------------------- ");
            System.out.println("|	ID		Name 				Age			Address 		  |");
            System.out.println(" ------------------------------------------------------------- ");

            while ((record = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(record, ",");
                if (record.contains(ID)) {
                    System.out.println("|	" + st.nextToken() + "	" + st.nextToken() + " 		" + st.nextToken() + "			" + st.nextToken() + "      |");
                }


            }

            System.out.println("|	                                            	          |");
            System.out.println(" ------------------------------------------------------------- ");

            br.close();


        }



        public static void updateRecordbyID() throws IOException {
            String newName, newAge, newAddr, record, ID, record2;

            File db = new File("CrudFile.txt");
            File tempDB = new File("CrudFileTemo.txt");

            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            Scanner strInput = new Scanner(System.in);

            System.out.println("\t\t Update Employee Record\n\n");
            System.out.println("Enter the Employee ID: ");
            ID = strInput.nextLine();
            System.out.println(" ------------------------------------------------------------- ");
            System.out.println("|	ID		Name 				Age			Address 		  |");
            System.out.println(" ------------------------------------------------------------- ");

            while ((record = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(record, ",");
                if (record.contains(ID)) {
                    System.out.println("|	" + st.nextToken() + "	" + st.nextToken() + " 		" + st.nextToken() + "			" + st.nextToken() + "      |");
                }

            }
            System.out.println("|	                                            	          |");
            System.out.println(" ------------------------------------------------------------- ");

            br.close();
            System.out.println("Enter the new Name: ");
            newName = strInput.nextLine();
            System.out.println("Enter the new Age: ");
            newAge = strInput.nextLine();
            System.out.println("Enter the new Address: ");
            newAddr = strInput.nextLine();

            BufferedReader br2 = new BufferedReader(new FileReader(db));

            while ((record2 = br2.readLine()) != null) {
                if (record2.contains(ID)) {
                    bw.write(ID + "," + newName + "," + newAge + "," + newAddr);
                } else {

                    bw.write(record2);
                }
                bw.flush();
                bw.newLine();
            }

            bw.close();
            br2.close();
            db.delete();
            boolean success = tempDB.renameTo(db);
            System.out.println(success);

        }
}