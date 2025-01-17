package com.mairieYopougon.extraitNaissance.Controller;

import com.mairieYopougon.extraitNaissance.Dto.ExtraitNaissancDto;
import com.mairieYopougon.extraitNaissance.Facade.ExtraitNaissanceFacade;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ws/extrait")
public class ExtraitDeNaissanceController {

    private final ExtraitNaissanceFacade extraitNaissanceFacade;


    public ExtraitDeNaissanceController(ExtraitNaissanceFacade extraitNaissanceFacade) {
        this.extraitNaissanceFacade = extraitNaissanceFacade;
    }

    @GetMapping("/lister")
    public List<ExtraitNaissancDto> lister() {
        return extraitNaissanceFacade.lister();
    }

    @GetMapping("/listerExtrait/{numeroExtrait}")
    public ExtraitNaissancDto listerUnExtrait(@PathVariable("numeroExtrait") String numeroExtrait) {
        return extraitNaissanceFacade.listerUnExtrait(numeroExtrait);
    }


}
