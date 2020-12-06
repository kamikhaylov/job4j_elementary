package ru.job4j.collection.job;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenComparatorJobAscByName() {
        Comparator<Job> cmpName = new JobAscByName();
        int rsl = cmpName.compare(
                new Job("1", 2),
                new Job("2", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobDescByName() {
        Comparator<Job> cmpName = new JobDescByName();
        int rsl = cmpName.compare(
                new Job("B", 1),
                new Job("A", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobAscByPriority() {
        Comparator<Job> cmpPriority = new JobAscByPriority();
        int rsl = cmpPriority.compare(
                new Job("B", 1),
                new Job("A", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparatorJobDescByPriority() {
        Comparator<Job> cmpPriority = new JobDescByPriority();
        int rsl = cmpPriority.compare(
                new Job("A", 2),
                new Job("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparator1ByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenComparator2ByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("A", 1),
                new Job("B", 1)
        );
        assertThat(rsl, lessThan(0));
    }
}