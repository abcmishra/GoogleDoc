import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Comment {
    private int commentId;
    private String content;
    private int documentId;
    private String ownerid;
    private List<User> userList;
    private int position;//position where the comment was made
    private Date date;

    public Comment(int commentId,String content,int documentId,String ownerid,int position,Date date){
        this.commentId=commentId;
        this.content=content;
        this.ownerid=ownerid;
        this.position=position;
        this.date= new Date();
        userList= new ArrayList<>();
        this.documentId=documentId;


    }

    


}
