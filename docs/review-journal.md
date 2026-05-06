# Review Journal

This journal records the domain cases that matter before widening the public API.

The local checks classify each case as `ship`, `watch`, or `hold`. That gives the project a small review vocabulary that matches its observability focus without claiming live deployment or external usage.

## Cases

- `baseline`: `span volume`, score 164, lane `ship`
- `stress`: `latency skew`, score 225, lane `ship`
- `edge`: `signal loss`, score 188, lane `ship`
- `recovery`: `incident shape`, score 228, lane `ship`
- `stale`: `span volume`, score 175, lane `ship`

## Note

The repository should be understandable without pretending it is larger than it is.
