# spring-product-register
<p>This application was made using Spring Boot, thymeleaf, bootstrap and Maven.</p>
<p>The project is able to offer a system that register a product that a common user wishes. It allows an user to request a quote for a product that is offered in a different region or even overseas. In the home page it displays the waiting products, the products that are already approved and the products that will be delivered on the nav bar. The products will have the card appearence different depending on their status. Gray for already delivered itens, green for approved and yellow for waiting products.</p>
<p>The form page is responsible for receiving the data informed by the user, like Name of the product, url of where this product could be found and the url of an image from the web. Those itens are validated in the back end and in case of null fields it will just return to the form page and a message to complete the fields properly will come up. The description part is not mandatory.</p>
<p>In the back we have 2 controllers for the pages, they are responsible for receiving the requests and calling the actions accordingly. There is also the model, which is a product and the enumerated order status. The Data transfer object "RequestNewProduct" is used in this application to avoid problems with the data that is not suppose to be informed by the user, but in another situation by the business.</p>
