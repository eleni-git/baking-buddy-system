// package bakingbuddysystem;

// import static org.junit.jupiter.api.Assertions.*;
// import org.junit.jupiter.api.BeforeEach;
// import org.junit.jupiter.api.Test;


// import java.util.Scanner;

// class BoxedIngredientsTest {

//     private BoxedIngredients boxedIngredients;
//     private Scanner mockScanner;

//     @BeforeEach
//     void setUp() {
//         // Create an instance of BoxedIngredients with valid data
//         boxedIngredients = new BoxedIngredients("Sugar", 5.0, 2.5, 1, 10);
       
//     }

//     @Test
//     void testConstructorWithParams() {
//         // Assert the fields are set correctly using the constructor with parameters
//         assertEquals("Sugar", boxedIngredients.GetName());
//         assertEquals(5.0, boxedIngredients.GetQuantity());
//         assertEquals(2.5, boxedIngredients.GetCostPerUnit());
//         assertEquals(1, boxedIngredients.GetId());
//         assertEquals(10, boxedIngredients.GetItemsPerBox());
//     }

//     @Test
//     void testConstructorEmpty() {
//         // Test the empty constructor
//         BoxedIngredients emptyBoxedIngredients = new BoxedIngredients();
//         assertNull(emptyBoxedIngredients.GetName());
//         assertEquals(0, emptyBoxedIngredients.GetQuantity());
//         assertEquals(0, emptyBoxedIngredients.GetCostPerUnit());
//         assertEquals(0, emptyBoxedIngredients.GetId());
//         assertEquals(0, emptyBoxedIngredients.GetItemsPerBox());
//     }

//     @Test
//     void testGetItemsPerBox() {
//         // Test the getter for itemsPerBox
//         assertEquals(10, boxedIngredients.GetItemsPerBox());
//     }

//     @Test
//     void testSetItemsPerBox() {
//         // Test the setter for itemsPerBox
//         boxedIngredients.SetItemsPerBox(20);
//         assertEquals(20, boxedIngredients.GetItemsPerBox());
//     }

//     @Test
//     void testToString() {
//         // Test the ToString() method
//         String expected = "Id: 1\nBoxed item: Sugar\nQuantity: 5.0\nCost per box: £2.5\nItems per box: 10\n";
//         assertEquals(expected, boxedIngredients.ToString());
//     }

//     @Test
//     void testAddIngredients() {

        
//         // Call the AddIngredients method and ensure the itemsPerBox is updated
//         boxedIngredients.AddIngredients();
//         assertEquals(15, boxedIngredients.GetItemsPerBox());
//     }

// }
