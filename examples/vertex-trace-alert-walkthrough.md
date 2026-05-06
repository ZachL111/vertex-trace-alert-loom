# Vertex Trace Alert Loom Walkthrough

I use this file as a small checklist before changing the Scala implementation.

| Case | Focus | Score | Lane |
| --- | --- | ---: | --- |
| baseline | span volume | 164 | ship |
| stress | latency skew | 225 | ship |
| edge | signal loss | 188 | ship |
| recovery | incident shape | 228 | ship |
| stale | span volume | 175 | ship |

Start with `recovery` and `baseline`. They create the widest contrast in this repository's fixture set, which makes them better review anchors than the middle cases.

The useful comparison is `incident shape` against `span volume`, not the raw score alone.
