import { useEffect, useState } from "react";
import "../style-promo/promo.css";
import { ListGroup } from "react-bootstrap";

function PromoCoppia() {
  const [promo, setPromo] = useState([]);

  useEffect(() => {
    const fetchPromo = async () => {
      const response = await fetch(
        "http://localhost:8080/api/promo/typePromo/Promo%20Coppia"
      );
      setPromo(await response.json());
    };
    fetchPromo();
  }, []);

  return (
    <>
      <div className="card card-promo">
        <h3 className="my-3 text-center">{promo.typePromo}</h3>

        <img src="/src/assets/img/coppia.jpg" alt="Photo couple" />

        <ListGroup>
          {promo.services ? (
            <ul>
              {promo.services.map((service) => (
                <li key={service.id}>{service.service}</li>
              ))}
            </ul>
          ) : (
            <p>No services found</p>
          )}
        </ListGroup>

        <div className="text-center my-3">
          <h4>A soli {promo.priceToDiscount}&#8364;!!</h4>
        </div>
      </div>
    </>
  );
}
export default PromoCoppia;
