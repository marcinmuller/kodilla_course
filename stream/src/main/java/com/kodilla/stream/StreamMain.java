package com.kodilla.stream;


import com.kodilla.stream.forum.Forum;
import com.kodilla.stream.forum.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum=new Forum();
        Map<Integer, ForumUser> par=forum
                .getUserList()
                .stream()
                .filter(s->s.getSex()=='M')
                .filter(s->s.getPostsNumber()>0)
                .filter(s->s.getBirthDate().plusYears(20).isBefore(LocalDate.now().plusDays(1)))
                .collect(Collectors.toMap(ForumUser::getId,s->s));

        par.entrySet().stream().forEach(System.out::println);
    }
}