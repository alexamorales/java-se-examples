package com.lisun.examples.interview;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Oleksii.Lisun
 * @since 1/15/14
 * Time: 5:53 PM
 */
@Setter
@Getter
public class User {
    private List<String> stringList;


    @Override
    public String toString() {
        return "User{" +
                "stringList=" + stringList +
                '}';
    }

    public static void main(String[] args) {
        User user1 = new User();
        User user2 = new User();
        user1.stringList = Arrays.asList("aa", "bb", "cc", "aa");
        user2.stringList = Arrays.asList("aa", "bb", "cc");


        List<User> userList = new ArrayList<>();

        userList.add(user1);
        userList.add(user2);

        Collections.sort(userList, (o1, o2) -> {
            if (o1.stringList.size() < o2.stringList.size()) {
                return -1;
            } else if (o1.stringList.size() > o2.stringList.size()) {
                return 1;
            }
            for (int i = 0; i < o1.stringList.size(); i++) {
                if (o1.stringList.get(i).compareTo(o2.stringList.get(i)) != 0) {
                    return o1.stringList.get(i).compareTo(o2.stringList.get(i));
                }
            }
            return 0;
        }
        );

        System.out.println(userList);

    }
}
