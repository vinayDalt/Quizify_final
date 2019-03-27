package com.stackroute.quizify.kafka.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;

/*
 * The Annotation "@Data" is used as a convenient shortcut annotation that bundles the features
 * of @ToString, @EqualsAndHashCode, @Getter / @Setter and @RequiredArgsConstructor together:
 * In other words, @Data generates all the boilerplate that is normally associated with simple
 * POJOs (Plain Old Java Objects).
 *
 * The Annotation "@Id" is used to declare that the field "id" as the Primary Key which will be
 * Non-Null and Unique.
 *
 * The Field "name" must be unique.
 *
 * Uniqueness of "name" of each Topic document must be Maintained.
 *
 * The Field "imageUrl" will contain the URL of an Image for that topic.
 *
 * The Field "subTopics" is a List of Topic (Objects of Topic Class) which will contain all the subTopics.
 *
 * The Field "admin" is used to store the data of the last Admin who Edited this category document.
 *
 * The Field "timeStamp" is used to store the Timestamp of last time the document is edited.
 */

@Data
public class Topic {
    @Id
    private long id;
    private String name;
    private String imageUrl;
}
