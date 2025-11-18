public class Hero {
    public Hero loadHeroFromFile() throws IOExeption {
        BufferReader br = new BufferReader(new FileReader("rpgsave.data"));
        String name = br.readLine();
        String hp = br.readLine();
        String mp = br.readLine();
        br.close();
        return new Hero(name, Integer.parseInt(hp), Integer.parseInt(mp));
    }
}
