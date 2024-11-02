package dev.praneeth.backend.LabTest;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/lab_test")
public class LabTestController {

    private final LabTestService labTestService;

    public LabTestController(LabTestService labTestService) {
        this.labTestService = labTestService;
    }

    @GetMapping
    public List<LabTest> getAllLabTests() {
        return labTestService.getAllLabTests();
    }

    @PostMapping
    public void addLabTest(@RequestBody LabTest labTest) {
        labTestService.addLabTest(labTest);
    }

    @DeleteMapping(path = "/{labTestId}")
    public void deleteLabTest(@PathVariable("labTestId") Integer labTestId) {
        labTestService.deleteLabTest(labTestId);
    }

    @PutMapping(path = "/{labTestId}")
    public void updateLabTest(@PathVariable("labTestId") Integer labTestId, @RequestBody LabTestUpdateRequest updateRequest) {
        labTestService.updateLabTest(labTestId, updateRequest);
    }
}