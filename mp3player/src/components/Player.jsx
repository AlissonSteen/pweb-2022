import { useRef, useState, useEffect } from "react"
import napster from "../services/napster"

function Player() {

    const [isPlaying, setIsPlaying] = useState(false)
    const [tracks, setTracks] = useState([])
    const [currentIndex, setCurrentIndex] = useState(0)
    const music = useRef()
    const key = "ZTVhYTU3MWEtZjRhNy00MmRmLWJiZDAtNjQwNTAwN2E0ODhi"

    useEffect(() => {
        getMusics()
    }, [])

    useEffect(() => {
        console.log(tracks)
    }, [tracks])

    const getMusics = async () => {
        let musics = await napster.get(`top?apikey=${key}`).then(r => r)
        setTracks(musics.data.tracks)
    }

    const loadSong = url => {
        music.current.src = url
        play()
    }

    const play = () => {
        music.current.play()
        setIsPlaying(true)
    }

    const pause = () => {
        music.current.pause()
        setIsPlaying(false)
    }

    const next = () => {
        setCurrentIndex(i => i > 19 ? 0 : i + 1)
    }

    const prev = () => {
        setCurrentIndex(i => i < 0 ? 19 : i - 1)
    }

    return (
        <div>
            <div class="container text-center">
                <div class="row align-items-center">
                    <div class="col"></div>
                    <div class="col">
                        {isPlaying ? (
                            <>
                                <div class="card">
                                    <img class="rounded mx-auto d-block" src={`http://direct.rhapsody.com/imageserver/v2/albums/${tracks[currentIndex]?.albumId}/images/400x400.jpg`} alt="Album cover"></img>
                                    <div class="card-body">
                                        <p class="card-text">
                                            <h2>Está tocando a música: {tracks[currentIndex]?.name}</h2>
                                            <h2>Artista: {tracks[currentIndex]?.artistName}</h2>
                                            <audio ref={music} src={tracks[currentIndex]?.url || "https://listen.hs.llnwd.net/g2/prvw/4/2/4/9/8/911189424.mp3"} ></audio>
                                            <button onClick={prev} class="btn btn-outline-info">Anterior</button>
                                            <button onClick={isPlaying ? pause : play} class="btn btn-outline-primary">
                                                {isPlaying ? "Pausar" : "Play"}
                                            </button>
                                            <button onClick={next} class="btn btn-outline-info">Próximo</button>
                                        </p>
                                    </div>
                                </div>
                            </>
                        ) : (
                            <>
                                <h2>Nenhuma música tocando no momento</h2>
                                <audio ref={music} src={tracks[currentIndex]?.url || "https://listen.hs.llnwd.net/g2/prvw/4/2/4/9/8/911189424.mp3"} ></audio>
                                <button onClick={isPlaying ? pause : play} class="btn btn-outline-primary">
                                    {isPlaying ? "Pausar" : "Play"}
                                </button>
                            </>
                        )}
                    </div>
                    <div class="col"></div>
                </div>
            </div>
        </div>
    )
}

export default Player