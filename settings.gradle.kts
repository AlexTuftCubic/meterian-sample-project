rootProject.name = "meterian-sample-project"
include("src:sample-service-1")
findProject(":src:sample-service-1")?.name = "sample-service-1"
include("src:library-1")
findProject(":src:library-1")?.name = "library-1"
