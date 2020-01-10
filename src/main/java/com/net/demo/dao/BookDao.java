package com.net.demo.dao;

import com.net.demo.dto.BookAndPublishAndAuthor;
import com.net.demo.po.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao extends JpaRepository<Book, Integer> {
//    @Query(value = "SELECT books.book_name book_name,authors.author_name author_name,publishers.publisher_name publisher_name " +
//            "FROM books left JOIN authors on books.author_id = authors.author_id " +
//            "LEFT JOIN publishers on books.publisher_id = publishers.publisher_id",
//            nativeQuery = true)
//    public List<BookAndPublishAndAuthor> findAllAndAuthorAndPublisher();
//    @Query(value = "select new com.net.demo.dto.BookAndPublishAndAuthor(b,a,p) from Book b,Author a,Publish p where b.authorId=a.authorId and b.publisherId=p.publisherId")
    //注意HQL语句中构造器的顺序
    @Query(value = "select new com.net.demo.dto.BookAndPublishAndAuthor(b,p,a) " +
            "from Book b left join Author a on b.authorId=a.authorId " +
            "left join Publisher p on p.publisherId=b.publisherId")
    public List<BookAndPublishAndAuthor> findAllAndAuthorAndPublisher();

//    @Query(value = "select b from Book b, ")
//    public List<Book> findAll123();
}
