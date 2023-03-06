import React, { useState } from "react";
import "./newsletter.css";

function Newsletter() {
  //  useState consente di creare, aggiornare e manipolare lo stato all'interno dei componenti funzionali.
  const [email, setEmail] = useState("");

  const handleSubmit = (e) => {
    //il preventDefault previene il caricamento della pagina
    e.preventDefault();
    sendEmailDb();
  };

  const sendEmailDb = () => {
    const data = { email: email };

    fetch("http://localhost:8080/api/email/email", {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(data),
    })
      .then((response) => {
        if (response.ok) {
          alert("Iscrizione avvenuta con successo!");
        } else {
          alert("Email già presente nel sistema");
        }
      })
      .catch((error) => {
        console.log(
          "Si è verificato un errore durante la richiesta HTTP POST: ",
          error
        );
      });
  };

  return (
    <form onSubmit={handleSubmit} className=" text-center ">
      <h2 className="text-newsletter">
        Iscriviti alla newsletter per ricevere le nostre promozioni e
        partecipare ai nostri fantastici eventi!
      </h2>
      <input
        type="email"
        value={email}
        onChange={(e) => setEmail(e.target.value)}
        placeholder="Inserisci la tua email"
        required
      />
      <button type="submit" className="submit p-2 ms-2 text-white">
        Iscriviti
      </button>
    </form>
  );
}
export default Newsletter;
