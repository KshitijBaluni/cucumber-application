package steps;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import thread.ScenarioThread;

import java.io.*;

public class TagDefinitions {

    ScenarioThread scenarioThread = null;

    @Given("^This is a valid login test$")
    public void this_is_a_valid_login_test() throws InterruptedException {
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a valid login");
        scenarioThread = new ScenarioThread();
        synchronized (scenarioThread) {
            System.out.println("ScenarioThread Created.");
            //scenarioThread.wait();
            System.out.println("ScenarioThread Wait is Over...! ");
            scenarioThread.run();
        }
    }

    @Given("^This is a invalid login test$")
    public void this_is_a_invalid_login_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a invalid login");
    }

    @Given("^This is a contact test case$")
    public void this_is_a_contact_test_case() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a contact test case");
    }

    @Given("^This is a deal test case$")
    public void this_is_a_deal_test_case() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a deal test case");
    }

    @Given("^This is a tasks test case$")
    public void this_is_a_tasks_test_case() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a tasks test case");
    }

    @Given("^This is a case test case$")
    public void this_is_a_case_test_case() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a case test case");
    }

    @Given("^clicking on left panel links$")
    public void clicking_on_left_panel_links() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: clicking on left panel links");
    }

    @Given("^This is a search deal test$")
    public void this_is_a_search_deal_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search deal test");
    }

    @Given("^This is a search contact test$")
    public void this_is_a_search_contact_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search contact test");
    }

    @Given("^This is a search case test$")
    public void this_is_a_search_case_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search case test");
    }

    @Given("^This is a search task test$")
    public void this_is_a_search_task_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search task test");
    }

    @Given("^This is a search call test$")
    public void this_is_a_search_call_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search call test");
    }

    @Given("^This is a search email test$")
    public void this_is_a_search_email_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search email test");
    }

    @Given("^This is a search docs test$")
    public void this_is_a_search_docs_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search docs test");
    }

    @Given("^This is a search forms test$")
    public void this_is_a_search_forms_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a search forms test");
    }

    @Given("^This is a report test$")
    public void this_is_a_report_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a report test");
    }

    @Given("^This is a logout test$")
    public void this_is_a_logout_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a logout test");
    }

    @Given("^This is a close browser test$")
    public void this_is_a_close_browser_test() throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Thread ID :" + Thread.currentThread().getId() + " - Tag Feature: This is a close browser test");
        if (scenarioThread != null) {
            synchronized (scenarioThread) {
                scenarioThread.notify();
            }
        }
        File file = new File("/home/kshitijbaluni/IdeaProjects/cucumber-application/test.txt");

        System.out.println("File name::" + file.getName());

        String st = "";

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            while ((st = br.readLine()) != null) {
                System.out.println(st);
                break;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (st.equals("0")) {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file));) {

                bw.write("1");
                System.out.println("Writing 1");
                Assert.assertEquals("2", "0");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false));) {
                bw.write("0");
                System.out.println("Writing 0");
                Assert.assertEquals("2", "2");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
