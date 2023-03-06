import "./card-beauty-center.css";

function CardBeautyCenter() {
  return (
    <div className="d-flex justify-content-center align-items-center flex-column px-5">
      {/* single card */}
      <div className="card my-5">
        <div className="row g-0">
          <div className="col-md-8">
            <div className="card-body">
              <h5 className="card-title">LA RECEPTION</h5>
              <p className="card-text">
                La reception è il primo momento di contatto con i/le nostri/e
                clienti, verranno accolti dal nostro staff che li guiderà
                all'interno del nostro centro per fargli conoscere questo angolo
                di paradiso, trasmettere pace, serenità e libertà.
              </p>
            </div>
          </div>
          <div className="col-md-4">
            <img
              src="/src/assets/img/RECEPTION.jpg"
              className="img-fluid rounded"
              alt="Photo reception"
            />
          </div>
        </div>
      </div>
      {/* single card */}
      <div className="card my-5">
        <div className="row g-0">
          <div className="col-md-4">
            <img
              src="/src/assets/img/CENTRO.jpg"
              className="img-fluid rounded"
              alt="Photo beauty"
            />
          </div>
          <div className="col-md-8">
            <div className="card-body">
              <h5 className="card-title">L'ACCESSO ALLE NOSTRE STANZE RELAX</h5>
              <p className="card-text">
                Qui è dove si ha accesso alle nostre stanze, dove le/i nostre/i
                clienti abbandonano tutti i loro pensieri e problemi della vita
                quotidiana, al di fuori, e sono pronte/i a farsi coccolare dal
                nostro staff. Ogni stanza è climatizzata, pulita e disinfettata
                dopo ogni appuntamento.
              </p>
            </div>
          </div>
        </div>
      </div>
      {/* single card */}
      <div className="card my-5">
        <div className="row g-0">
          <div className="col-md-8">
            <div className="card-body">
              <h5 className="card-title">PRISCILLA</h5>
              <p className="card-text">
                Priscilla è dove effettuiamo trattamenti di viso e corpo.
                Trattamenti per il viso e corpo permettono di apparire più
                belle, sono molto popolari e ti farà sentire più raggiante,
                giovane e tonificata. Ogni giorno la pelle è esposta agli agenti
                esterni e all'inquinamento e, più raramente, anche al sole. La
                vita frenetica spesso ci impedisce di avere cura della nostra
                pelle. I nostri trattamenti prevedono una serie di cure di
                bellezza che mirano ad avere una peòòe sana, pulita ed
                equilibrata, lasciandola morbida e fresca, mentre tu ti sentirai
                coccolata e rilassata.
              </p>
            </div>
          </div>
          <div className="col-md-4">
            <img
              src="/src/assets/img/VISO.jpg"
              className="img-fluid rounded"
              alt="Photo facials and body treatments"
            />
          </div>
        </div>
      </div>
      {/* single card */}
      <div className="card my-5">
        <div className="row g-0">
          <div className="col-md-4">
            <img
              src="/src/assets/img/TRATTAMENTI.jpg"
              className="img-fluid rounded"
              alt="Photo massage"
            />
          </div>
          <div className="col-md-8">
            <div className="card-body">
              <h5 className="card-title">ATENA</h5>
              <p className="card-text">
                Atena, la stanza del puro relax... L'idea di relax è
                strettamente legata ai massaggi, ma oggi rilassarsi è divenuto
                un privilegio per pochi per via dei ritmi frenetici della
                quotidianità. Estetica "La Perla" non ti offre solamente
                massaggi, ma esperienze "mistiche": distendi i muscoli e
                allontana i tuoi problemi dalla mente, tornerai come nuova/o!
              </p>
            </div>
          </div>
        </div>
      </div>
      {/* single card */}
      <div className="card my-5">
        <div className="row g-0">
          <div className="col-md-8">
            <div className="card-body">
              <h5 className="card-title">A A ABBRONZATISSIMA</h5>
              <p className="card-text">
                Hai sempre sognato di goderti l'abbronzatura tutto l'anno?
                Grazie a Estetica "La Perla", salone di riferimento per molti
                clienti a Roma, è possibile! Il centro di bellezza offre infatti
                un ottimo servizio solarium: troverai lampada al collagene,
                docce solari e lettini solari. Ogni apparecchio è dotato di
                tecnologia all'avanguardia, così da ottenere i migliori
                risultati possibili senza rischi per la salute della tua pelle.
              </p>
            </div>
          </div>
          <div className="col-md-4">
            <img
              src="/src/assets/img/SOLARIUM.jpg"
              className="img-fluid rounded"
              alt="Photo solarium"
            />
          </div>
        </div>
      </div>
    </div>
  );
}
export default CardBeautyCenter;
