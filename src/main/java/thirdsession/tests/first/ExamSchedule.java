package thirdsession.tests.first;

public class ExamSchedule {
    private ExamNode head;
    private ExamNode current;

    public ExamSchedule() {
        this.head = null;
        this.current = null;
    }


    public void addExam(String examDetails) {
        // TODO 2: Implement logic to add an exam to the end of the linked list
        ExamNode newExam = new ExamNode(examDetails);
        if(head == null){
            head = newExam;
            current = newExam;
            System.out.println("The new exam has benn added.");

        }else {
            ExamNode helper = head;
            while(helper.next != null){
                helper = helper.next;
            }
            helper.next = newExam;
            newExam.prev = helper;
            // current = newExam;
        }

        System.out.println("The new exam has been added: " + examDetails);

    }


    public void viewNextExam() {
        // TODO 3: Implement the logic to move to the next exam in the list and displays it

        if (current == null) {
            System.out.println("No exams available.");
        } else {
            System.out.println("Next Exam: " + current.examDetails);

            if (current.next == null) {
                System.out.println("You have reached the last exam.");
            } else {
                current = current.next;
            }
        }
    }


    public void viewPreviousExam() {
        if (current == null) {
            System.out.println("No exams available.");
        } else if(current.prev == null){
            // TODO 4: Implement logic to move to the previous exam in the list and display it
            System.out.println("Previous Exam: " + current.examDetails);
            System.out.println("You are at the first exam.");
        }else {
            current = current.prev;
            System.out.println("Previous Exam: " + current.examDetails);
        }
    }

    public void viewAllExamSchedule() {
        ExamNode temp = head;
        if (temp == null) {
            System.out.println("No exams scheduled.");
        } else {
            System.out.println("Exam Schedule:");
            while (temp != null) {
                System.out.println(temp.examDetails);
                temp = temp.next;
            }
        }
    }
}
