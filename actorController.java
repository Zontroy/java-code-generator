// actorController.java.zref
public class actorController {
    @Autowired
    private actorRepository actorRepository;

    @GetMapping("/actors")
    public Listactor getAllactors() {
        return actorRepository.findAll();
    }
}