package by;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

public class JavaTestTask1 extends DefaultTask {

    @Input
    String msg = "Default message";

    @TaskAction
    public void test() {
        System.out.println(msg);
    }
}
