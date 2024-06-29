package Data

import io.ktor.http.Headers.Empty.get
import org.koin.dsl.module

val provideviewModelModule = module {
    single {
        viewModel(get())
    }
}
