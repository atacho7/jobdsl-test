multibranchPipelineJob('python-deploy') {
    branchSources {
        git {
            remote('https://github.com/atacho7/test-jenkins1.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
}
