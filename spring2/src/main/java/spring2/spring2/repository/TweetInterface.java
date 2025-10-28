package spring2.spring2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring2.spring2.entities.Tweet;

public interface TweetInterface extends JpaRepository<Tweet, Long> {

}
