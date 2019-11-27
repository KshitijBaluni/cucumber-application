package steps;

import io.cucumber.java.en.Given;
import org.testng.Assert;

import java.io.*;

public class TagDefinitions {

    @Given("^This is a valid login test$")
    public void this_is_a_valid_login_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a invalid login test$")
    public void this_is_a_invalid_login_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a contact test case$")
    public void this_is_a_contact_test_case() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a deal test case$")
    public void this_is_a_deal_test_case() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a tasks test case$")
    public void this_is_a_tasks_test_case() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a case test case$")
    public void this_is_a_case_test_case() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^clicking on left panel links$")
    public void clicking_on_left_panel_links() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search deal test$")
    public void this_is_a_search_deal_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search contact test$")
    public void this_is_a_search_contact_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search case test$")
    public void this_is_a_search_case_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");

    }

    @Given("^This is a search task test$")
    public void this_is_a_search_task_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search call test$")
    public void this_is_a_search_call_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search email test$")
    public void this_is_a_search_email_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search docs test$")
    public void this_is_a_search_docs_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a search forms test$")
    public void this_is_a_search_forms_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a report test$")
    public void this_is_a_report_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a logout test$")
    public void this_is_a_logout_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
    }

    @Given("^This is a close browser test$")
    public void this_is_a_close_browser_test() {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature");
        File file = new File("/home/kshitijbaluni/IdeaProjects/cucumber-application/test.txt");

        System.out.println("File name::" + file.getName());

        String st = "";

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            while ((st = br.readLine()) != null) {
                System.out.println(st);
                br.close();
                break;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (st.equals("0")) {

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                bw.write("1");
                bw.close();
                System.out.println("Writing 1");
                Assert.assertEquals("2", "0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));
                bw.write("0");
                bw.close();
                System.out.println("Writing 0");
                Assert.assertEquals("2", "2");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
