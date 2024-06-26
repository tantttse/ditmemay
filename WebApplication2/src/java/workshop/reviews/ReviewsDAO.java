package workshop.reviews;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import workshop.utils.DBUtils;

public class ReviewsDAO {

    public List<ReviewsDTO> getAllReviews() {
        List<ReviewsDTO> reviews = new ArrayList<>();

        try {
            String sql = "SELECT ReviewID,Rating,Comment,ReviewDate FROM Reviews ";
            Connection con = DBUtils.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                while (rs.next()) {

                    ReviewsDTO dto = new ReviewsDTO();
                    dto.setRating(rs.getInt("ReviewID"));
                    dto.setRating(rs.getInt("Rating"));
                    dto.setComment(rs.getString("Comment"));
                    dto.setReviewDate(rs.getDate("ReviewDate"));
                    reviews.add(dto);
                }
            }

            con.close();
        } catch (Exception e) {
        }

        return reviews;
    }
}
