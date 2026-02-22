package ag.selm.catalogue.controller.payload;

import org.jetbrains.annotations.NotNull;
import jakarta.validation.constraints.Size;


public record NewProductPayload(

        @NotNull
        @Size(min = 3, max = 50)
        String title,

        @Size(max = 1000)
        String details) {
}
