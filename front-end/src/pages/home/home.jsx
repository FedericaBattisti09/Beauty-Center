import "./home.css";

function Home() {
  return (
    <>
      <div className="container text-center">
        <div className="title">
          <h1 className="title-perla"> Estetica "La Perla"</h1>
          <h3 className="sub-title-perla"> di Federica Battisti</h3>
        </div>
        <div className="videoHome">
          <video
            autoPlay
            muted
            loop
            none="true"
            width="100%"
            height="100%"
            src="/src/assets/video/video.sali.mp4"
            alt="video/home"
          />
        </div>
      </div>
      <div className="phrase mt-5 p-3">
        <h2>
          “Dalla preistoria ai tempi moderni, la perla è stata da sempre il
          simbolo della perfetta e pura bellezza”
        </h2>
      </div>
    </>
  );
}
export default Home;
