package thirdsession.firsttask;

public class Main {
    public static void main(String[] args){
        // created array object of Student class
        Student[] students = new Student[5];
        // set the values through the constructor
        students[0] = new Student(1,"John", 19);
        // TODO 1:  create other 4 object of student class and assign to the array Students
        students[1] = new Student(2,"Joe", 20);
        students[2] = new Student(3,"Josh", 21);
        students[3] = new Student(4,"Jonny", 22);
        students[4] = new Student(5,"Joel", 23);
        // TODO 2: Uncomment the method call once you have completed the mentioned tasks
        int IndexToDelete = 2;
        removeElement(IndexToDelete, students);

        AddElement(new Student(11,"Mary",32), students);

        int IndexToUpdate = 3;
        updateElement(IndexToUpdate, students);
    }
    public static void removeElement(int IndexToDelete, Student[] originalArray){
        //TODO 3: create a new array with a length less than the existing one. For example, if your existing array is students, the new array's size will be students.length - 1
        Student[] newStudents = new Student[originalArray.length - 1];
        //TODO 4 : use a ‘for loop’ to copy all elements from the existing array to the new array, except for the element at the index you want to remove
        for(int i = 0; i < originalArray.length -1; i++){
            if(i < IndexToDelete){
                newStudents[i] = originalArray[i];
            }
            if(i >= IndexToDelete){
                newStudents[i] = originalArray[i+1];
            }
        }
        //TODO 5: if needed, add the new array back to your original array variable

        //TODO 6: call printArray method and pass "Remove" and new array.
        printArray("Remove",newStudents);
    }
    public static void AddElement(Student newStudent,Student[] originalArray){
        //TODO 7: define a new array with a length of students.length + 1. This ensures there is space for the new element.
        Student[] newStudents = new Student[originalArray.length + 1];
        // TODO 8: use a ‘for loop’ to copy all elements from the existing students array to the new array. Iterate over each element and assign it to the corresponding index in the new array.
        for( int i = 0; i < originalArray.length; i++){
            newStudents[i] = originalArray[i];
        }
        newStudents[originalArray.length] = newStudent;
        // TODO 9: create a newStudent object and assign it to the last index of the new array, which is newArray[newArray.length - 1].
        // TODO 10: place these three steps inside the addElement method in your class. printArray("Add",newArray);
        printArray("Add",newStudents);
    }
    public static void updateElement(int indexToUpdate, Student[] originalArray){
        // TODO 11: locate the element you need to update. Use the element's index of the array.
        for(int i = 0; i < originalArray.length; i++){
            if(i == indexToUpdate){
                originalArray[i].setName("Mimo");
                originalArray[i].setAge(30);
                originalArray[i].setRollNumber(9);
            }
        }
        //TODO 12: once you have the index, access the element and update its properties.
        // Use the ‘setter’ method in the Student class to change values like name, age, or ID.
        printArray("Update",originalArray);
    }
    public static void printArray(String message, Student[] students){
       /* TODO 13: include a print statement to indicate the current action being performed,
           such as ‘Removing student’, ‘Adding student’, or ‘Updating student’
        */
        System.out.println("\n" + message);
        // TODO 14: use a ‘for loop’ to go through each element in the array.
        for(int i = 0; i < students.length; i++){
            System.out.println("ID:" + students[i].getRollNumber() + " name: " + students[i].getName() + " age: " + students[i].getAge());
        }
        // TODO 15: within the loop, use the ‘getter’ method to fetch each student's details and print them using the student object.

    }
}
