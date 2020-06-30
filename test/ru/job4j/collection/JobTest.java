package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenSameNameThenSecondComp() {
        Comparator<Job> cmpNamePriority = new JobIncByName().thenComparing(new JobIncByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Fix bug", 3),
                new Job("Fix bug", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorByNameAndProrityDesc() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        Collections.sort(jobs, cmpNamePriority);

        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        Collections.sort(expected, new JobDescByName());

        assertThat(jobs, is(expected));
    }

    @Test
    public void whenCompatorByNameAndProrityInc() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        Comparator<Job> cmpNamePriority = new JobIncByName().thenComparing(new JobIncByPriority());
        Collections.sort(jobs, cmpNamePriority);

        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        Collections.sort(expected, new JobIncByName());

        assertThat(jobs, is(expected));
    }

    @Test
    public void whenCompatorByPriorityAndNameInc() {
        List<Job> jobs = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        Comparator<Job> cmpNamePriority = new JobIncByPriority().thenComparing(new JobIncByName());
        Collections.sort(jobs, cmpNamePriority);

        List<Job> expected = Arrays.asList(
                new Job("X task", 0),
                new Job("Fix bug", 1)
        );
        Collections.sort(expected, new JobIncByPriority());

        assertThat(jobs, is(expected));
    }

    @Test
    public void whenCompatorByNameInc() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        List<Job> sorted = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );
        Collections.sort(jobs, new JobIncByName());

        Iterator<Job> it = jobs.iterator();

        assertThat(it.next(), is(new Job("Fix bug", 1)));
        assertThat(it.next(), is(new Job("X task", 0)));
    }

    @Test
    public void whenCompatorByPriorityInc() {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("X task", 0)
        );

        Collections.sort(jobs, new JobIncByPriority());

        Iterator<Job> it = jobs.iterator();
        assertThat(it.next(), is(new Job("X task", 0)));
        assertThat(it.next(), is(new Job("Fix bug", 1)));
    }
}