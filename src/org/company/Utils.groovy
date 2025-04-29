package org.company

class Utils implements Serializable {
    def steps

    Utils(steps) { this.steps = steps }

    def sayGoodbye(name = 'World') {
        steps.echo "Goodbye, ${name}!"
    }
}

