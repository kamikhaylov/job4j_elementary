package ru.job4j.collection.search04;

import org.junit.Test;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class NotifyAccountTest {
    @Test
    public void sent() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001")
        );
        Set<Account> expect = Set.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }

    @Test
    public void deleteDuplicates() {
        List<Account> accounts = Arrays.asList(
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("123", "Petr Arsentev", "eDer3432f"),
                new Account("142", "Petr Arsentev", "000001"),
                new Account("142", "Petr Arsentev", "000001")
        );
        Set<Account> expect = Set.of(
                        new Account("123", "Petr Arsentev", "eDer3432f"),
                        new Account("142", "Petr Arsentev", "000001")
        );
        assertThat(NotifyAccount.sent(accounts), is(expect));
    }
}