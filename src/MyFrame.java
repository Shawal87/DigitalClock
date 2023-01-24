import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MyFrame extends JFrame {

    // Attributes
    Calendar calendar;
    SimpleDateFormat timeFormat;
    SimpleDateFormat dayFormat;
    SimpleDateFormat dateFormat;
     String time;
     String day;
     String date;
    // Label
    JLabel timeLabel;
    JLabel dayLabel;
    JLabel dateLabel;


    MyFrame( ){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("My Clock App");
        this.setLayout(new FlowLayout());
        this.setSize(350,350);
        this.setResizable(false);


        //instance timeFormat
        timeFormat = new SimpleDateFormat("hh:mm:ss a");
         dayFormat = new SimpleDateFormat("EEEE");
         dateFormat  = new SimpleDateFormat("MM dd, yyyy");




        //instance Jlabel time
        timeLabel = new JLabel();

        //font
        timeLabel.setFont(new Font("Verdana",Font.PLAIN,50));
        timeLabel.setForeground(new Color(0x00FF00));
        timeLabel.setBackground(Color.gray);
        timeLabel.setOpaque(true);


        // instance JLabel daytime
        dateLabel = new JLabel();
        dateLabel.setFont(new Font("BOLD",Font.PLAIN,50));
        dateLabel.setForeground(new Color(000000));
        dateLabel.setBackground(Color.gray);
        dateLabel.setOpaque(true);



        //instance JLabel datetime

        dayLabel = new JLabel();
        dayLabel.setFont(new Font("BOLD",Font.PLAIN,50));
        dayLabel.setForeground(new Color(0000000));
        dayLabel.setBackground(Color.gray);
        dayLabel.setOpaque(true);


       // method  reference get method for time(object) pass value
        time = timeFormat.format(Calendar.getInstance().getTime());
        timeLabel.setText(time);

        //Method reference get daytime
        day = timeFormat.format(Calendar.getInstance().getFirstDayOfWeek());
        timeLabel.setText(day);

        date = timeFormat.format(Calendar.getInstance().getTime());
        dateLabel.setText(date);



        this.add(dateLabel);
        this.add(dayLabel);
        this.add(timeLabel);
        this.setVisible(true);

       // setTime method()
        setTime();

    }

    private void setTime() {
        while(true){
            time = timeFormat.format(Calendar.getInstance().getTime());
            timeLabel.setText(time);

            day = dayFormat.format(Calendar.getInstance().getTime());
            dayLabel.setText(day);

            date = dateFormat.format(Calendar.getInstance().getTime());
            dateLabel.setText(date);

            //
           try{
               Thread.sleep(1000);
               // delayed function on time
           }catch (InterruptedException e){
               e.printStackTrace();
           }
        }
    }
}
