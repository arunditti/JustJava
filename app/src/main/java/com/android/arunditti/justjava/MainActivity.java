package com.android.arunditti.justjava;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
//http://developer.android.com/reference/android/widget/ListView.html
    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** this method is called when plus sign is pressed */

    public void increment(View view) {
            quantity = quantity + 1;
        displayQuantity(quantity);
    }

    /** this method is called when minus sign is pressed */

    public void decrement(View view) {
            quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int price = calculatePrice();
       /**  String priceMessage = createOrderSummary(price);
        displayMessage(priceMessage); */
        displayMessage(createOrderSummary(price));
    }

    /**
     * Calculates the price of the order.
     *
     * @return total price
     */
    private int calculatePrice() {
       /** int price = quantity * 5;
        return price; */
        return quantity * 5;
    }

    /**
     * Create summary of the order
     * @param price of the order
     * @return text summary
     */
    private String createOrderSummary(int price) {
        String priceMessage = "Name: Arunditti Sharma ";
        priceMessage = priceMessage + "\nQuantity: " + quantity;
        //priceMessage = priceMessage + "\nAmount Due $" + price; or can be written as
        priceMessage += "\nAmount Due: $" + price;
        //priceMessage = priceMessage + " \nThank You"; or can be written as
        priceMessage += " \nThank You";
        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + numberOfCoffees);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.order_summary_text_view);
        orderSummaryTextView.setText(message);
    }
}


/**package com.android.arunditti.justjava;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/

