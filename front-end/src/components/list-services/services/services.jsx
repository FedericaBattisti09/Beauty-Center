import "./services.css";

//cosi richiamiamo le sigole tuple ( righe )
function Services(props) {
  return (
    <p className="allServices">
      {props.service} {props.price}&#8364;
    </p>
  );
}
export default Services;
