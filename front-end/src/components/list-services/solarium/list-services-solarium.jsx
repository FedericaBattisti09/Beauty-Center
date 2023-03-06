import Services from "../services/services";
import { useEffect, useState } from "react";

function ListServicesSolarium() {
  const [services, setServices] = useState([]);

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

export default ListServicesSolarium;
