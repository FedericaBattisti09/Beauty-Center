import Services from "../services/services";
import { useEffect, useState } from "react";

function ListServicesBody() {
  const [services, setServices] = useState([]);
  //Usando questo Hook ( useEffect), dici a React che il tuo componente deve fare qualcosa dopo che la pagina viene reindirizzata
  useEffect(() => {
    const fetchServices = async () => {
      const response = await fetch(
        "http://localhost:8080/api/listservices/category/Corpo"
      );
      setServices(await response.json());
    };
    fetchServices();
  }, []);

  return (
    <>
      {services.map((service) => (
        <Services
          category={service.category}
          service={service.service}
          price={service.price.toFixed(2)}
          key={service.id}
        />
      ))}
    </>
  );
}
export default ListServicesBody;
