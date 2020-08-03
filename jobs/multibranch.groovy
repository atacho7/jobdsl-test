multibranchPipelineJob('python-deploy') {
    triggers {
        periodic(5)
    }
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
