import "./contact.css";
import Newsletter from "../../components/contact-newsletter/newsletter";
import Map from "../../components/map-contact/map";

function Contact() {
  return (
    <>
      <div className="contactTitle text-center">
        <h2>Prenota il tuo trattamento</h2>
        <h3>
          Finalmente hai trovato i professionisti dell’estetica. Estetica "La
          Perla" opera sulla città di Roma.
          <br />
          Aperto dal lunedì al sabato mattina, riceve su appuntamento. Per
          fissare il tuo, puoi contattarci chiamando sia il numero di telefono
          fisso sia il cellulare. Risponderemo a tutte le tue domande di
          bellezza!
        </h3>
      </div>
      <div className="containerContact d-flex gap-5 justify-content-center">
        <div>
          <h2>Contatti</h2>
          <p>Via Severo Carmignano 28 - 00151 Roma</p>
          <p>06/5525698</p>
          <p>+39 3409831554</p>
          <p>Estetica@laperla.com</p>
        </div>

        <div>
          <h2>Orari di Apertura</h2>
          <p>Lun-Ven: 9:00-13:00/ 15:00-19:00</p>
          <p>Sab: 9:30-13:00</p>
          <p>Dom: chiuso</p>
        </div>
      </div>
      <Map />
      <Newsletter />
    </>
  );
}
export default Contact;
