# Density Converter

A Density Converter.

## Flowchart

:::mermaid
    flowchart LR
    A((start))-->B{User Input}
    B-->|User Input: X|X(Exit)
    B-->|User Input: A|C(get User Input)
    subgraph Loop
    D-->|User Input: Y|C
    C-->D{Continue?}
    end
    D-->|User Input: N|X
:::
