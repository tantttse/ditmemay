/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop.reviews;

import java.sql.Date;

/**
 *
 * @author kirikaza
 */
public class ReviewsDTO {
     private int reviewID;
    private int rating;
    private String comment;
    private Date reviewDate;

    // Constructor
    public ReviewsDTO() {
    }

    public ReviewsDTO(int reviewID, int rating, String comment, Date reviewDate) {
        this.reviewID = reviewID;
        this.rating = rating;
        this.comment = comment;
        this.reviewDate = reviewDate;
    }

    // Getter and Setter methods
    public int getReviewID() {
        return reviewID;
    }

    public void setReviewID(int reviewID) {
        this.reviewID = reviewID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(Date reviewDate) {
        this.reviewDate = reviewDate;
    }

    
}
