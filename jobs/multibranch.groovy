multibranchPipelineJob('python-deploy') {
    branchSources {
        git {
            id('123456789')
            remote('https://github.com/atacho7/test-jenkins1.git')
        }
    }
    orphanedItemStrategy {
        discardOldItems {
            numToKeep(20)
        }
    }
    triggers {
        periodic(1)
    }
}
