<html>
<h1>Zoo Management Program</h1>
<p>Welcome to ZOOtopia! This comprehensive zoo management application is designed to provide both administrators and visitors with an immersive experience in the animal kingdom. This README will guide you through the program's features, functionalities, and how to use it effectively.</p>

<h3>Introduction</h3>
<p>The zoo management application is built using Object-Oriented programming to ensure effective design. It caters to the needs of both administrators and visitors.</p>

<h3>Features:</h3>

<h4>Admin:</h4>
<ol>
  <li>Manage Attractions</li>
  <li>Manage Animals</li>
  <li>Schedule Events</li>
  <li>Discounts</li>
  <li>Special Deals</li>
  <li>Visitor Statistics</li>
  <li>View Feedback</li>
</ol>

<h4>Visitor:</h4>
<ol>
  <li>Login/Register</li>
  <li>Explore Zoo</li>
  <li>Buy Membership</li>
  <li>Buy Tickets</li>
  <li>View Discounts</li>
  <li>View Special Deals</li>
  <li>Visit Animals</li>
  <li>Visit Attractions</li>
  <li>Leave Feedback</li>
</ol>

<h3>Getting Started:</h3>
<ol>
  <li>mvn clean</li>
  <li>mvn compile</li>
  <li>mvn package</li>
  <li>java -jar Assignment-1.0-SNAPSHOT.jar</li>
</ol>
<p>This will start the program.</p>

<h3>Implementation:</h3>

<ul>
  <li><b>Main (Class):</b><br>The main class of the application is responsible for program execution and user interaction.</li>

  <li><b>Admin (Class):</b><br>Represents zoo administrators with privileges to manage attractions, animals, discounts, and special deals.</li>

  <li><b>Visitor (Class):</b><br>Represents zoo visitors, allowing registration, login, and interaction with attractions and tickets.</li>

  <li><b>Attraction (Class):</b><br>Represents different attractions within the zoo and provides details such as name, ticket price, and open/close status.</li>

  <li><b>Discount (Class):</b><br>Models discounts available to visitors, including conditions based on age.</li>

  <li><b>Special Deals (Class):</b><br>Manages special deals for visitors based on the number of attractions they choose to visit.</li>

  <li><b>Animal (Interface):</b><br>Ensures that classes representing zoo animals adhere to a common set of methods for retrieving information and making sounds.</li>

  <li><b>Mammal, Reptile, and Amphibian (Classes):</b><br>
  Mammal, Reptile, and Amphibian classes implement the Animal interface. This ensures that each of these classes provides specific implementations for methods defined in the Animal interface.</li>

  <li><b>Zoo (Class):</b><br>
  The Zoo class contains collections of Animal, Attraction, and other objects. It is responsible for managing and organizing these objects within the zoo. The polymorphic behavior of the Animal interface allows the Zoo class to interact with different animal types uniformly.</li>
</ul>

<h3>Usage:</h3>
<ol>
  <li><b>Admin:</b>
    <ul>
      <li>Manage Attractions:</li>
      <ul>
        <li>Admins can add, modify, remove, and view attractions based on their preferences.</li>
        <li>All attractions are closed by default. To open them, schedule events.</li>
      </ul>
      <li>Manage Animals:</li>
      <ul>
        <li>Admins can add, update details, and remove animals.</li>
        <li>When adding animals, they are given the choice to add the animal to a particular attraction.</li>
        <li>Ensure that you add a sufficient number of animals of each type to attractions to make them valid for entry.</li>
      </ul>
      <li>Schedule Events:</li>
      <ul>
        <li>Admins can open/close attractions, edit the price of tickets, and check how many tickets are bought in each attraction.</li>
      </ul>
      <li>Discounts:</li>
      <ul>
        <li>Admins can add, remove, and view discounts.</li>
      </ul>
      <li>Special Deals:</li>
      <ul>
        <li>Admins can view, add, and remove deals.</li>
      </ul>
      <li>Visitor Statistics:</li>
      <ul>
        <li>Admins can select an attraction and view the total number of visitors, total revenue, and check which the most popular attraction is.</li>
      </ul>
      <li>Feedback:</li>
      <ul>
        <li>Admins can view feedback left by visitors.</li>
      </ul>
  </li>
  <li>Visitor:</li>
  <ul>
    <li>To start using the zoo system, a visitor needs to:</li>
    <li>Login or Register and then Login.</li>
    <li>After logging in, visitors can:</li>
    <li>Explore the zoo:</li>
    <ul>
      <li>View Attractions or view Animals</li>
    </ul>
    <li>Buy Membership:</li>
    <ul>
      <li>Choose to buy a Basic or a Premium Membership.</li>
      <li>A premium member is not required to buy tickets to attractions.</li>
      <li>If they are applicable for any discounts, they can use the discount codes and apply them.</li>
    </ul>
    <li>Buy Tickets:</li>
    <ul>
      <li>Basic members need to buy tickets.</li>
      <li>They can use applicable discounts while purchasing them.</li>
      <li>They can also use valid special deals based on the number of purchases.</li>
    </ul>
    <li>View Discounts and Deals:</li>
    <ul>
      <li>Can see all discounts and their codes and use the ones applicable to them.</li>
    </ul>
    <li>Visit Animals:</li>
    <ul>
      <li>Allows them to see all the animals in the zoo and choose between feeding them or reading about them.</li>
    </ul>
    <li>Visit Attractions:</li>
    <ul>
      <li>Can use the purchased tickets to visit attractions based on their availability.</li>
    </ul>
    <li>Feedback:</li>
    <ul>
      <li>Can leave feedback.</li>
    </ul>
  </ul>
</ol>
</html>
